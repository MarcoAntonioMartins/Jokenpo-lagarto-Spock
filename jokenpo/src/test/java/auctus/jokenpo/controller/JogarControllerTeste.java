package auctus.jokenpo.controller;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class JogarControllerTeste {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void jogar_com_cadastro_inexistente() throws Exception {
        URI url = new URI("/jogar");
        String cadastrado = "[{\"id\":\"1\"},{\"id\":\"2\"},{\"id\":\"4\"}]";

        mockMvc.perform(MockMvcRequestBuilders.get(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(400));

    }

    @Test
    public void jogar_com_cadastros_existente() throws Exception {
        URI url = new URI("/jogar");
        String cadastrado = "[{\"id\":\"1\"},{\"id\":\"2\"},{\"id\":\"3\"}]";

        mockMvc.perform(MockMvcRequestBuilders.get(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void jogar_classico_com_cadastro_inexistente() throws Exception {
        URI url = new URI("/jogar_classico");
        String cadastrado = "[{\"id\":\"1\"},{\"id\":\"45\"}]";

        mockMvc.perform(MockMvcRequestBuilders.get(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(400));

    }

    @Test
    public void jogar_classico_com_cadastros_existente() throws Exception {
        URI url = new URI("/jogar_classico");
        String cadastrado = "[{\"id\":\"1\"},{\"id\":\"2\"}]";

        mockMvc.perform(MockMvcRequestBuilders.get(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void coletar_todos_os_resultados() throws Exception {
        URI url = new URI("/resultado");

        mockMvc.perform(MockMvcRequestBuilders.get(url))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void coletar_um_resultado() throws Exception {
        URI url = new URI("/resultado_unico");
        String cadastrado = "{\"id\":\"1\"}";

        mockMvc.perform(MockMvcRequestBuilders.get(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    

}
