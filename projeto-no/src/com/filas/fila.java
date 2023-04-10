package com.filas;

import com.nopilha.no;

public class fila {

    private no refNoEntradaFila;

    public fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty () {
        return refNoEntradaFila == null? true : false;
    }

    public void enqueue(no novoNo) {
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public no first() {
        if(!this.isEmpty()) {
            no primeiroNo = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
        }
        return null;
    }

    public no dequeue() {
        if(!this.isEmpty()) {
            no primeiroNo = refNoEntradaFila;
            no noAuxiliar = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        no noAuxiliar  = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getRefNo() + "}]--->";
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }               

            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
    
}
