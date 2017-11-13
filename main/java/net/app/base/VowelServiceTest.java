package net.app.base;


import org.junit.Assert;
import org.junit.Test;

public class VowelServiceTest {

    @Test
    public void getFirstVowel() throws Exception {
    }

    @Test
    public void getFirstVowelShouldReturnE(){
        VowelService vowelService = new VowelService();
        String result = vowelService.getFirstVowel("aAbBABacafe");

        Assert.assertEquals(result,"E");
    }

    @Test
    public void getFirstVowelShouldReturnEmpty(){
        VowelService vowelService = new VowelService();
        String result = vowelService.getFirstVowel("aAbBABacaggfe");

        Assert.assertEquals(result,"");
    }
}
