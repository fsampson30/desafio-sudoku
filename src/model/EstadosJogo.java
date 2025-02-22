package model;

public enum EstadosJogo {

    NON_STARTED("não iniciado"),
    INCOMPLETE("incompleto"),
    COMPLETE("completo");

    private String label;

    EstadosJogo(final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
