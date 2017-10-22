/**
 *
 */
package br.com.samuelweb.efd.icms.bo.blocoD;

import br.com.samuelweb.efd.icms.registros.blocoD.RegistroD120;
import br.com.samuelweb.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD120 {

    public static StringBuilder gerar(RegistroD120 registroD120, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroD120.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroD120.getCod_mun_orig()));
        sb.append("|").append(Util.preencheRegistro(registroD120.getCod_mun_dest()));
        sb.append("|").append(Util.preencheRegistro(registroD120.getVeic_id()));
        sb.append("|").append(Util.preencheRegistro(registroD120.getUf_id()));
        sb.append("|").append('\n');

        return sb;
    }
}
