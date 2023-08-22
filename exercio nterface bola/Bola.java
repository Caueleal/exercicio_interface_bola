abstract class Bola implements Lancavel {
    private String nomeDaMarca;

    public Bola (String nomeDaMarca){
        
    }

    public String getNomeDaMarca() {
        return nomeDaMarca;
    }

    public void setNomeDaMarca(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }
    
    public abstract void quicar();
}
