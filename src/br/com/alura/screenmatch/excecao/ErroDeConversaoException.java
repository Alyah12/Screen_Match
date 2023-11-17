package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoException extends Throwable {
    private String mensagem;

    public ErroDeConversaoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
