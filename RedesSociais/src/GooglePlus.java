public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento
{

    @Override
    public void compartilhar() {
        System.out.println("O usuário compartilhou uma publicação no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("O usuário postou uma foto no GooglePlus");
    }


    @Override
    public void postarVideo() {
        System.out.println("O usuário postou um vídeo no GooglePlus");

    }

    @Override
    public void postarComentario() {
        System.out.println("O usuário comentou em uma publicação no GooglePlus");

    }

    @Override
    public void fazStreaming() {
        System.out.println("O usuário realizou uma vídeo conferência no GooglePlus");

    }
}
