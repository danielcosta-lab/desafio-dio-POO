package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    public Curso () {
        
    }

    /**
     * @return int return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}