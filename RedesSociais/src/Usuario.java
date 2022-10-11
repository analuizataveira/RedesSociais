public class Usuario
{
    private String nome;
    private String email;

    RedeSocial[] redeSocial = new RedeSocial[10];

    public void Usuario (RedeSocial redeSociais) {

        for (int i = 0; i < redeSocial.length; i++) {

            //inserindo o array
            if (redeSocial[i] == null) {
                redeSocial[i] = redeSociais;

                //vericando de qual classe pertence o tipo rede social
                if (redeSocial[i] instanceof Facebook)
                {
                    System.out.println("---Usuário cadastrado no Facebook--");
                    break;
                }
                else if (redeSocial[i] instanceof Instagram)
                {
                    System.out.println("---Usuário cadastrado no Instagram--");
                    break;
                }
                else if (redeSocial[i] instanceof GooglePlus)
                {
                    System.out.println("---Usuário cadastrado no GooglePlus--");
                    break;
                }
                else if (redeSocial[i] instanceof Twitter)
                {
                    System.out.println("---Usuário cadastrado no Twitter--");
                    break;
                }

                break;
            }
        }
    }


    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
