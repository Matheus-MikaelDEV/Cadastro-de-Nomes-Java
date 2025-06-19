package application;

import entities.People;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int option = 0;
        List<People> people = new ArrayList();

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] - Cadastrar pessoa\n[2] - Listar pessoas\n[3] - Remover pessoa\n[4] - Sair");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("-------------------");
                    System.out.println("Cadastro de pessoa");
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Idade: ");
                    Integer age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Pessoa cadastrada com sucesso!");

                    people.add(new People(name, age));
                    Collections.sort(people, Comparator.comparing(People::getName));
                    break;
                case 2:
                    System.out.println("-------------------");
                    System.out.println("Listagem de pessoas");
                    if (people.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (People p : people) {
                            System.out.println("Nome: " + p.getName() + ", Idade: " + p.getAge());
                        }
                    }
                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("Remoção de pessoa");
                    if (people.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        System.out.print("Digite o nome da pessoa a ser removida: ");
                        String nameRemove = sc.nextLine();

                        for (People p : people) {
                            if (p.getName().equals(nameRemove)) {
                                people.remove(p);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
            }
        } while (option != 4);
    }
}
