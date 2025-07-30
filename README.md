<img width="1842" height="795" alt="image" src="https://github.com/user-attachments/assets/8bf98bb7-7c7b-4f64-bee6-d2734155b0cc" /># desafio-POO-DIO

 ```mermaid
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
