package com.nopilha;

public class pilha {
    
    private no refNoEntradaPilha;

    public pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(no novoNo) {
        no refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public no pop() {
        if(!this.isEmpty()) {
            no noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }

    public no top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {

        if(refNoEntradaPilha == null) {
            return true;
        }

        return false;



    }

    @Override
    public String toString() {
        String stringRetorno = "--------------------------------------\n";
        stringRetorno += "             Pilha\n";
        stringRetorno += "------------------------------------\n";

        no noAuxiliar = refNoEntradaPilha;

        while (true) {
            if(noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "========================\n";
        return stringRetorno;
    }

}
