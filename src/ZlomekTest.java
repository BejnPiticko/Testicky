import static org.junit.jupiter.api.Assertions.*;

class ZlomekTest {

    @org.junit.jupiter.api.Test
    void getCitatel() {
        Zlomek z = new Zlomek(4, 3);
        assertEquals(z.getJmenovatel(), z.getCitatel());

    }

    @org.junit.jupiter.api.Test
    void setCitatel() {
        Zlomek z = new Zlomek(3, 4);
    }

    @org.junit.jupiter.api.Test
    void getJmenovatel() {
        Zlomek z = new Zlomek(3, 4);
    }

    @org.junit.jupiter.api.Test
    void setJmenovatel() {
        Zlomek z = new Zlomek(3, 4);
    }

    @org.junit.jupiter.api.Test
    void scitani() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(7, 8);
    }

    @org.junit.jupiter.api.Test
    void odcitani() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(7, 8);
    }

    @org.junit.jupiter.api.Test
    void nasobeni() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(7, 8);
    }

    @org.junit.jupiter.api.Test
    void deleni() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(7, 8);
    }
    @org.junit.jupiter.api.Test
    void kraceni() {
    }

    @org.junit.jupiter.api.Test
    void NSD() {
    }
}