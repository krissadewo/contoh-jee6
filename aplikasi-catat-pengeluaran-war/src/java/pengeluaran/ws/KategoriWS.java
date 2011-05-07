/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pengeluaran.ws;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pengeluaran.entity.Kategori;
import pengeluaran.service.KategoriServiceLocal;

/**
 *
 * @author endy
 */
@WebService(serviceName = "KategoriWS")
public class KategoriWS {
    @EJB
    private KategoriServiceLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "simpan")
    @Oneway
    public void simpan(@WebParam(name = "kategori")
    Kategori kategori) {
        ejbRef.simpan(kategori);
    }

    @WebMethod(operationName = "semuaKategori")
    public List<Kategori> semuaKategori() {
        return ejbRef.semuaKategori();
    }

    @WebMethod(operationName = "kategoriDenganKode")
    public Kategori kategoriDenganKode(@WebParam(name = "kode")
    String kode) {
        return ejbRef.kategoriDenganKode(kode);
    }

    @WebMethod(operationName = "kategoriDenganId")
    public Kategori kategoriDenganId(@WebParam(name = "id")
    Long id) {
        return ejbRef.kategoriDenganId(id);
    }
    
}
