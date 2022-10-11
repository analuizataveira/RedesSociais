public class Facebook extends RedeSocial implements VideoConferencia,Compartilhamento
{

    @Override
    public void postarFoto() {
        System.out.println("O usuário postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("O usuário postou um vídeo no facebook");

    }

    @Override
    public void postarComentario() {
        System.out.println("O usuário comentou em uma publicação no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("O usuário realizou uma vídeo conferência no Facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("O usário compartilhou uma publicação no Facebook");
    }
}

