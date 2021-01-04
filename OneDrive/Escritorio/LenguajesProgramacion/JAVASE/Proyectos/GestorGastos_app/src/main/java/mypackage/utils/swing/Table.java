package mypackage.utils.swing;

import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Table <T> {
    
    public void cargar(JTable  jTable, List<T> lista){
        
        if(jTable==null){
            return;
        }
        DefaultTableModel defaultTableModel= new DefaultTableModel();
        
        jTable.setModel(defaultTableModel);
    
        if(lista==null || lista.isEmpty()){
            return;
        }
        
        //--Lista de campos usando appi reflect--
        T listaCampos=lista.get(0);
        
        Field[] campos=listaCampos.getClass().getDeclaredFields();
        
        for(Field field:campos){
            //El nombre de cada campo lo agrego como columna del default table model
            defaultTableModel.addColumn(field.getName());
        }
        
        //--Lista de registros usandop api reflect--

        for(T  listaRegistros:lista){
            
            Object[] registro=new Object[campos.length]; 
            
            for(int i=0; i<campos.length; i++){
                    
                Field field=campos[i];
                
                String metodoRegistro="get"
                        + field.getName().substring(0,1).toUpperCase() 
                        +field.getName().substring(1);
                
               // System.out.println(metodoRegistro);
                    try {            
                       registro[i]= listaCampos.getClass()
                               .getMethod(metodoRegistro, null)
                               .invoke(listaRegistros, null);
                        
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
            defaultTableModel.addRow(registro);
        }
    }
}