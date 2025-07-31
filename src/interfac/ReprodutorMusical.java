package interfac;

public interface ReprodutorMusical {

    public default void tocar(){

        System.out.println("Musica tocando");

    }

    public  default void pausar(){

        System.out.println("Musica pausada!");
    }


    public default void selecionarMusica(String musica){

        System.out.println("A musica " +  " está selecionada");
    }
}
