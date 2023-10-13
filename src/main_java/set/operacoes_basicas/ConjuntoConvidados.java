package main_java.set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadosSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemovido = null;

        if (!convidadosSet.isEmpty()){
            for (Convidado c: convidadosSet) {
                if (c.getCodigo() == codigoConvite){
                   convidadoRemovido = c;
                   break;
                }
            }
            convidadosSet.remove(convidadoRemovido);
        }
        else{
            throw new RuntimeException("Lista vazia!");
        }
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        //ADICIONANDO CONVIDADOS
        convidados.adicionarConvidado("Bianca", 55);
        convidados.adicionarConvidado("Kaylane", 68);
        convidados.adicionarConvidado("Juscileia", 18);
        convidados.adicionarConvidado("Juscileia", 15);

        System.out.println("Número Atual de convidados: " + convidados.contarConvidados());
        convidados.exibirConvidados();

        //TENTANDO ADICIONAR CONVIDADOS COM MESMO CÓDIGO
        convidados.adicionarConvidado("Bárbara", 10);
        convidados.adicionarConvidado("Júlio", 10);
        System.out.println("Número Atual de convidados: " + convidados.contarConvidados());
        convidados.exibirConvidados();

        //EXCLUINDO CONVIDADOS
        convidados.removerConvidadoPorCodigoConvite(15);
        convidados.removerConvidadoPorCodigoConvite(10);
        System.out.println("Número Atual de convidados: " + convidados.contarConvidados());
        convidados.exibirConvidados();

    }
}
