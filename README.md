# desafio-POO-DIO

classDiagram
direction TB
    class Iphone {
    }

    class ReprodutorMusical {
	    +tocar()
	    +pausar()
	    +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
	    +ligar(String numero)
	    +atender()
	    +iniciarCorreioVoz()
    }

    class NavegadorInternet {
	    +exibirPagina(String url)
	    +adicionarNovaAba()
	    +atualizarPagina()
    }

	<<Class>> Iphone
	<<Interface>> ReprodutorMusical
	<<Interface>> AparelhoTelefonico

	note for Iphone "This is a sample note"
	note "This is a sample note"

    Iphone <|-- ReprodutorMusical
    Iphone <|-- AparelhoTelefonico
    Iphone <|-- NavegadorInternet
