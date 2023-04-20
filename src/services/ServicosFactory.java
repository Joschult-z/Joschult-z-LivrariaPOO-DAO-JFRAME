/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author 182120023
 */
public class ServicosFactory {

    private static ClienteServicos cServicos = new ClienteServicos();
    private static EditoraServicos eServicos = new EditoraServicos();
    private static LivroServicos lservicos = new LivroServicos();
    private static VendaLivroServicos vlS = new VendaLivroServicos();
    

    public static ClienteServicos getClienteServicos() {
        return cServicos;
    }

    public static EditoraServicos getEditoraServicos() {
        return eServicos;
    }

    public static LivroServicos getLivroServicos() {
        return lservicos;
    }
    public static VendaLivroServicos getVendaLivroServicos(){
        return vlS;
    }

}
