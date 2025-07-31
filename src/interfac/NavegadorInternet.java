package interfac;

public interface NavegadorInternet {


    public default void exibirPagina(String url){
        System.out.println("Acessando o link " + url);

    }

    public default void adicionarNovaAba(){
        System.out.println("Nova aba foi adicionada");

    }

    public default void atualizarPagina(){
        System.out.println("Atualiando pagina");

    }

}
