/**
 * Copyright (C) 2017 Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package br.eti.romel.lounge.javaonion.extenso.heroku;

import br.eti.romel.lounge.extenso.*;
import java.math.*;
import lombok.*;

/**
 *
 * @author Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
@NoArgsConstructor
public class Bean {

    @Getter
    private String valor;

    @Getter
    private String extenso;

    public Bean(String valor) {
        this.valor = valor;
        this.extenso = new Extenso(new BigDecimal(valor)).toString();
    }

    public void setValor(String valor) {
        this.valor = valor;
        this.extenso = new Extenso(new BigDecimal(valor)).toString();
    }
}
