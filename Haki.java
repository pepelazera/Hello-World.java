package Exercicio;

public abstract class Haki {

    boolean hakiDaObservacao;
    boolean hakiDoArmamento;
    boolean hakiDoRei;

    boolean hakiDaObervacaoAvancado;
    boolean hakiDOArmamentoAvancado;
    boolean hakiDoReiAvancado;

    public Haki() {
    }

    public Haki(boolean hakiDaObservacao, boolean hakiDoArmamento, boolean hakiDoRei) {
        this.hakiDaObservacao = hakiDaObservacao;
        this.hakiDoArmamento = hakiDoArmamento;
        this.hakiDoRei = hakiDoRei;
    }

    public Haki(boolean hakiDaObservacao, boolean hakiDoArmamento, boolean hakiDoRei, boolean hakiDaObervacaoAvancado, boolean hakiDOArmamentoAvancado, boolean hakiDoReiAvancado) {
        this(hakiDaObservacao, hakiDoArmamento, hakiDoRei);
        this.hakiDaObervacaoAvancado = hakiDaObervacaoAvancado;
        this.hakiDOArmamentoAvancado = hakiDOArmamentoAvancado;
        this.hakiDoReiAvancado = hakiDoReiAvancado;
    }


}
