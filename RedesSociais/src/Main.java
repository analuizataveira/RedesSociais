public class Main {

    public static void main(String[] args) {

        //Criando usuário
        Usuario user = new Usuario();
        user.setNome("anataveira");
        user.setEmail("ana.taveiira@gmail.com");

        //Criando redes sociais
        Facebook fb = new Facebook();
        fb.senha = "batatafrita";
        fb.numAmigos = 1000;

        GooglePlus gg = new GooglePlus();
        gg.senha = "simon123";
        gg.numAmigos = 10;

        Twitter tt = new Twitter();
        tt.senha = "batataassada";
        tt.numAmigos = 900;

        Instagram insta = new Instagram();
        insta.senha = "aninhabatata";
        insta.numAmigos = 2400;

        //Setando o usuário cadastrado como o usuário das redes sociais
        user.Usuario(fb);
        user.Usuario(gg);
        user.Usuario(tt);
        user.Usuario(insta);


        //Tratamento de dados
        for (int i = 0; i < user.redeSocial.length; i++) {
            if (user.redeSocial[i] != null) {
                if (user.redeSocial[i] instanceof Facebook) {
                    Facebook auxfb = (Facebook) user.redeSocial[i];
                    auxfb.compartilhar();
                    auxfb.postarFoto();
                    auxfb.fazStreaming();
                    System.out.println("--------------------------");

                } else if (user.redeSocial[i] instanceof GooglePlus) {
                    GooglePlus auxgp = (GooglePlus) user.redeSocial[i];
                    auxgp.compartilhar();
                    auxgp.fazStreaming();
                    auxgp.curtirPublicacao();
                    System.out.println("---------------");
                } else if (user.redeSocial[i] instanceof Twitter) {
                    Twitter auxtt = (Twitter) user.redeSocial[i];
                    auxtt.compartilhar();
                    auxtt.curtirPublicacao();
                    auxtt.postarComentario();
                    System.out.println("---------------");
                } else if (user.redeSocial[i] instanceof Instagram) {
                    Instagram auxinsta = (Instagram) user.redeSocial[i];
                    auxinsta.postarComentario();
                    auxinsta.postarVideo();
                    auxinsta.postarFoto();
                    System.out.println("---------------");
                }
            }
        }

    }

}
