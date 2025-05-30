import java.util.Scanner;

public class Main {

    static Integer numCarros = 0, numMotos = 0;
    public static void main(String[] args) {
        Boolean sair = false;
        Integer choice;
        
        Carro[] carros = new Carro[100];
        Moto[] motos = new Moto[100];
        Scanner scan = new Scanner(System.in);

        while(!sair){
            System.out.println("O que deseja fazer?\n" +
                                "1- Adicionar\n" +
                                "2- Detalhar\n" +
                                "0- Sair\n");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    adicionar(carros, motos, scan);
                    break;
                    
                case 2:
                    detalhar(carros, motos, scan);
                    break;
                    
                case 0:
                    sair = true;
                    break;    
            }
        }
        scan.close();
    }

    public static void adicionar(Carro[] carros, Moto[] motos, Scanner scan){
        Boolean sair = false;
        Integer choice;

        while(!sair){
            System.out.println("O que deseja adicionar?\n" +
                                "1- Carro\n" +
                                "2- Moto\n" +
                                "0- Voltar\n");
            choice = scan.nextInt();
            scan.nextLine();            
        
            switch(choice){
                case 1:
                    adicionarCarro(carros, scan);
                    numCarros++;
                    break;
                    
                case 2:
                    adicionarMoto(motos, scan);
                    numMotos++;
                    break;
                    
                case 0:
                    sair = true;
                    break;
            }
        }
    }

    public static void adicionarCarro(Carro[] carros, Scanner scan){
        carros[numCarros] = new Carro();

        System.out.println("Qual é a marca do carro?");
        carros[numCarros].setMarca(scan.nextLine());
        
        System.out.println("Qual é o modelo do carro?");
        carros[numCarros].setModelo(scan.nextLine());

        System.out.println("Qual é o ano do carro?");
        carros[numCarros].setAno(scan.nextInt());
        scan.nextLine();

        System.out.println("Qual é o numero de portas do carro?");
        carros[numCarros].setNumPortas(scan.nextInt());
        scan.nextLine();
    }

    public static void adicionarMoto(Moto[] motos, Scanner scan){
        motos[numMotos] = new Moto();

        System.out.println("Qual é a marca da moto?");
        motos[numMotos].setMarca(scan.nextLine());
        
        System.out.println("Qual é o modelo da moto?");
        motos[numMotos].setModelo(scan.nextLine());

        System.out.println("Qual é o ano da moto?");
        motos[numMotos].setAno(scan.nextInt());
        scan.nextLine();

        System.out.println("Qual é o tipo de guidao da moto?");
        motos[numMotos].setTipoGuidao(scan.nextLine());
    }

    public static void detalhar(Carro[] carros, Moto[] motos, Scanner scan){
        Boolean sair = false;
        Integer choice;

        while(!sair){
            System.out.println("O que deseja detalhar?\n" +
                                    "1- Carro\n" +
                                    "2- Moto\n" +
                                    "3- Ambos\n" +
                                    "0- Voltar\n");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    if(numCarros == 0){
                        System.out.println("Voce nao possui carros cadastrados");
                        break;
                    }
                    for(int i = 0; i < numCarros; i++){
                        System.out.println(carros[i].exibirDetalhes());
                    }
                    break;
                    
                case 2:
                    if(numMotos == 0){
                        System.out.println("Voce nao possui motos cadastradas");
                        break;
                    }
                    for(int i = 0; i < numMotos; i++){
                        System.out.println(motos[i].exibirDetalhes());
                    }
                    break;
                    
                case 3:
                    if(numCarros == 0){
                        System.out.println("Voce nao possui carros cadastrados");
                        break;
                    }
                    System.out.println("Carros:");
                    for(int i = 0; i < numCarros; i++){
                        System.out.println(carros[i].exibirDetalhes());
                    }
                    
                    if(numMotos == 0){
                        System.out.println("Voce nao possui motos cadastradas");
                        break;
                    }
                    System.out.println("Motos:");
                    for(int i = 0; i < numMotos; i++){
                        System.out.println(motos[i].exibirDetalhes());
                    }
                    break;
                    
                case 0:
                    sair = true;
                    break;
            }
        }
    } 
}
