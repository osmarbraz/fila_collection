
/**
 * No para uma fila.
 *
 */
public class No {

    // Dado do nó
    private int dado;
    //Encadeamento para o próximo nó
    private No proximo;

    /**
     * Construtor sem parâmetro.
     */
    public No() {
        this.dado = 0;
        this.proximo = null;
    }

    /**
     * Construtor com parâmetro.
     *
     * @param _dado Um valor do tipo inteiro a ser armazenado
     */
    public No(int _dado) {
        setDado(_dado);
        setProximo(null);
    }
    //Set's

    /**
     * Modificador de dado
     *
     * @param dado Um valor inteiro
     */
    public void setDado(int dado) {
        this.dado = dado;
    }

    /**
     * Modificador de próximo
     *
     * @param proximo Um nó da lista
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    //Get's
    /**
     * Recuperador de dado
     *
     * @return Um valor inteiro
     */
    public int getDado() {
        return dado;
    }

    /**
     * Recuperador de nó
     *
     * @return Um nó da lista
     */
    public No getProximo() {
        return proximo;
    }

    //Retorna o dado em String
    public String paraString() {
        return "OID: " + this + " / dado: " + getDado();
    }
}
