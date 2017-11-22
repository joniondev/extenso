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
package br.eti.romel.lounge.javaonion.extenso.rest;

import br.eti.romel.lounge.extenso.*;
import java.math.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * REST Web Service
 *
 * @author Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
@Path("extenso")
public class ExtensoREST {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Extenso
     */
    public ExtensoREST() {
    }

    /**
     * Retrieves representation of an instance of
     * br.eti.romel.lounge.javaonion.extenso.rest.ExtensoREST
     *
     * @param valor valor a ser convertido em extenso.
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{valor}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("valor") String valor) {
        final BigDecimal numero = new BigDecimal(valor);
        final String formato = "{valor: %s, extenso: '%s'}";

        return String.format(formato, valor, new Extenso(numero).toString());
    }
}
