/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.List;
import model.Aprendiz;

/**
 *
 * @author APRENDIZ
 */
public interface MeAprendiz {
    public Aprendiz list(int id);
    public List listadoA();
    public boolean registrarAp(Aprendiz ap);
    public boolean actualizarAp(Aprendiz ap);
    public boolean eliminarAp(Aprendiz ap);
}
