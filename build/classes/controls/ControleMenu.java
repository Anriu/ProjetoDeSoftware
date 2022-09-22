
package controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vision.TelaLogin;
import vision.TelaMenu;

public class ControleMenu implements ActionListener{
    
    private TelaMenu telaMenu;
    
    
    public ControleMenu() {
        telaMenu = new TelaMenu();
        telaMenu.getBotaoVoltar().addActionListener(this);
        telaMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(telaMenu.getBotaoVoltar())){
          telaMenu.setVisible(false);
          TelaLogin telalogin = new TelaLogin();
        }
    }
}
