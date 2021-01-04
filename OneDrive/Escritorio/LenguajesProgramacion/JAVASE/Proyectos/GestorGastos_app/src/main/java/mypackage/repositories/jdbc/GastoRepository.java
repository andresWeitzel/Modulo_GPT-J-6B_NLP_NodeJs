package mypackage.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mypackage.connector.LocalConnector;
import mypackage.entities.Gasto;
import mypackage.repositories.interfaces.I_GastoRepository;


public class GastoRepository implements I_GastoRepository{

    private Connection conexionDB;

    public GastoRepository(Connection conexionDB) {
        this.conexionDB = conexionDB;
    }

    public void save(Gasto gasto) {
        if (gasto == null) {
            return;
        }
        try ( PreparedStatement consultaPreparada
                = conexionDB.prepareStatement(
                        "INSERT INTO gastos(id,precio_compras,comentario_compras,precio_servicios,"
                                + "comentario_servicios,precio_transporte,comentario_transporte,fecha)"
                        + "VALUES(?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS
                )) {

                    consultaPreparada.setInt(1, gasto.getId());
                     consultaPreparada.setFloat(2, gasto.getPrecio_compras());
                    consultaPreparada.setString(3, gasto.getComentario_compras());
                    consultaPreparada.setFloat(4, gasto.getPrecio_servicios());
                    consultaPreparada.setString(5, gasto.getComentario_servicios());
                    consultaPreparada.setFloat(6, gasto.getPrecio_transporte());
                    consultaPreparada.setString(7, gasto.getComentario_transporte());
                    consultaPreparada.setString(8, gasto.getFecha());

                    consultaPreparada.execute();

                    ResultSet resultadoQuery = consultaPreparada.getGeneratedKeys();

                    if (resultadoQuery.next()) {
                        gasto.setId(resultadoQuery.getInt(1));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
    
       }
  @Override
    public void remove(Gasto gasto) {
        if (gasto == null) {
            return;
        }
        try ( PreparedStatement consultaPreparada
                = conexionDB.prepareStatement("DELETE FROM gastos WHERE id=?")) {

            consultaPreparada.setInt(1, gasto.getId());

            consultaPreparada.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void update(Gasto gasto) {
        if (gasto == null) {
            return;
        }
        try ( PreparedStatement consultaPreparada
                = conexionDB.prepareStatement(
                        "UPDATE  gastos SET  precio_compras=?,comentario_compras=?,precio_servicios=?,"
                                + "comentario_servicios=?,precio_transporte=?,comentario_transporte=?,fecha=? WHERE id=?"))
                    {
                    consultaPreparada.setFloat(1, gasto.getPrecio_compras());
                    consultaPreparada.setString(2, gasto.getComentario_compras());
                    consultaPreparada.setFloat(3, gasto.getPrecio_servicios());
                    consultaPreparada.setString(4, gasto.getComentario_servicios());
                    consultaPreparada.setFloat(5, gasto.getPrecio_transporte());
                    consultaPreparada.setString(6, gasto.getComentario_transporte());
                    consultaPreparada.setString(7, gasto.getFecha());
                    consultaPreparada.setInt(8, gasto.getId());

                    consultaPreparada.execute();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
    }

    @Override
    public List<Gasto> getAll() {

        List<Gasto> listaGastos = new ArrayList();

        try ( ResultSet resultSetGastos
                = conexionDB
                        .createStatement()
                        .executeQuery("SELECT * FROM gastos")) {
                    while (resultSetGastos.next()) {

                        listaGastos.add(new Gasto(
                                
                                resultSetGastos.getInt("id"),
                                resultSetGastos.getFloat("precio_compras"),
                                resultSetGastos.getString("comentario_compras"),
                                resultSetGastos.getFloat("precio_servicios"),
                                resultSetGastos.getString("comentario_servicios"),
                                resultSetGastos.getFloat("precio_transporte"),
                                resultSetGastos.getString("comentario_transporte"),
                                resultSetGastos.getString("fecha") 
                        ));

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return listaGastos;
    }


}
