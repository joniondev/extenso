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
package br.eti.romel.lounge.extenso.rest.util;

import javax.ws.rs.*;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

/**
 *
 * @author Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
public class ExtensoREST_JerseyClient {

    private static final String BASE_URI = "http://localhost:8080/extenso-rest/rest";
    private final WebTarget webTarget;
    private final Client client;

    public ExtensoREST_JerseyClient() {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("extenso");
    }

    public String getJson(String valor) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{valor}));
        return resource.request(MediaType.APPLICATION_JSON).get(String.class);
    }

    public void close() {
        client.close();
    }
}
