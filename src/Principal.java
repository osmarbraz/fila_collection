
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Declara a pilha
        Queue<No> fila = new LinkedList<>();

        //Menu para controle da lista
        int opcao = -1;
        while (opcao != 9) {
            //Monta o menu de opcoes
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### Fila com Collection ###\n"
                    + "1 - Emfileirar\n"
                    + "2 - Desemfileirar\n"
                    + "3 - Consultar\n"
                    + "4 - Mostrar Início\n"
                    + "5 - Contar\n"
                    + "6 - Listar\n"
                    + "9 - Sair"));
            switch (opcao) {
                case 1: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado a ser emfileirado"));
                    No novo = new No(dado);
                    fila.offer(novo);
                    break;
                }
                case 2: {
                    No dado = fila.poll();
                    if (dado != null) {
                        JOptionPane.showMessageDialog(null, "O nó" + dado.getDado() + " foi desemfileirado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O nó do início não foi desemfileirado");
                    }
                    break;
                }
                case 3: {
                    int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite posição a ser consultado"));
                    No procurar = null;
                    for (No c : fila) {
                        if (c.getDado() == chave) {
                            procurar = c;
                        }
                    }
                    if (fila.contains(procurar) == true) {
                        JOptionPane.showMessageDialog(null, "Achei o nó");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não Achei o nó");
                    }
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Topo: " + fila.peek().getDado());
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Qtde de nós" + fila.size());
                    break;
                }
                case 6: {
                    String saida = "Dados da Fila:\n";
                    for (No c : fila) {
                        saida = saida + c.getDado() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, saida);
                    break;
                }
                default:
                    break;
            }
        }//Fim While
    }
}
