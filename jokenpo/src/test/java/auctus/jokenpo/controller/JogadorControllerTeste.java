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
public class JogadorControllerTeste {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void cadastro_sem_nome() throws Exception {
        URI url = new URI("/cadastrar");
        String cadastrado = "{\"nome\":,\"jogada\":\"Papel\"}";

        mockMvc.perform(MockMvcRequestBuilders.post(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(400));

    }

    @Test
    public void cadastro_com_nome_sem_jogada() throws Exception {
        URI url = new URI("/cadastrar");
        String cadastrado = "{\"nome\":\"Marco\",\"jogada\":}";

        mockMvc.perform(MockMvcRequestBuilders.post(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(400));

    }

    @Test
    public void cadastro_com_nome_com_jogada_errada() throws Exception {
        URI url = new URI("/cadastrar");
        String cadastrado = "{\"nome\":\"Marco\",\"jogada\":\"paper\"}";

        mockMvc.perform(MockMvcRequestBuilders.post(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(400));

    }

    @Test
    public void cadastro_com_nome_com_jogada_correto() throws Exception {
        URI url = new URI("/cadastrar");
        String cadastrado = "{\"nome\":\"Marco\",\"jogada\":\"Papel\"}";

        mockMvc.perform(MockMvcRequestBuilders.post(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void editar_cadastro_inexistente() throws Exception {
        URI url = new URI("/editar");
        String cadastrado = "{\"id\":\"45\",\"nome\":\"Marco\",\"jogada\":\"Spock\"}";

        mockMvc.perform(MockMvcRequestBuilders.put(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(400));

    }

    @Test
    public void editar_cadastro_existente() throws Exception {
        URI url = new URI("/editar");
        String cadastrado = "{\"id\":\"1\",\"nome\":\"Marco\",\"jogada\":\"Spock\"}";

        mockMvc.perform(MockMvcRequestBuilders.put(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void excluir_cadastro_inexistente() throws Exception {
        URI url = new URI("/remover");
        String cadastrado = "{\"id\":\"45\"}";

        mockMvc.perform(MockMvcRequestBuilders.delete(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(400));

    }

    @Test
    public void excluir_cadastro_existente() throws Exception {
        URI url = new URI("/remover");
        String cadastrado = "{\"id\":\"1\"}";

        mockMvc.perform(MockMvcRequestBuilders.delete(url).content(cadastrado).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

}
