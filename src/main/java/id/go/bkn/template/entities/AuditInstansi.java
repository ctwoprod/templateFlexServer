package id.go.bkn.template.entities;

// Generated 06 Nov 14 12:05:39 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AuditInstansi generated by hbm2java
 */
@Entity
@Table(name = "audit_instansi", catalog = "simwasdal")
public class AuditInstansi implements java.io.Serializable {

	private String id;
	private String tahunAudit;
	private String instansiId;
	private String loginIdIsiCreate;
	private Date tglAwalIsiKriteria;
	private Date tglAkhirIsiKriteria;
	private String statusIsi;
	private short pnsSkorKebutuhanPns;
	private short pnsSkorPengadaanPns;
	private short pnsSkorPangkatJabatan;
	private short pnsSkorPengembanganKarirPns;
	private short pnsSkorDiklat;
	private short pnsSkorPolaKarirPns;
	private short pnsSkorPromosi;
	private short pnsSkorMutasiPns;
	private short pnsSkorPenilaianKinerja;
	private short pnsSkorGajiTunjangan;
	private short pnsSkorPenghargaan;
	private short pnsSkorDisiplin;
	private short pnsSkorPemberhentianPns;
	private short pnsSkorPensiunJaminanHariTua;
	private short pnsSkorPerlindungan;
	private short pnsSkorTotal;
	private Date tglAwalAuditKriteria;
	private Date tglAkhirAuditKriteria;
	private String hasilEvaluasiAudit;
	private String statusEvaluasiAudit;
	private String loginIdAuditCreate;

	public AuditInstansi() {
	}

	public AuditInstansi(String id, String tahunAudit, String instansiId,
			String loginIdIsiCreate, Date tglAwalIsiKriteria,
			Date tglAkhirIsiKriteria, String statusIsi,
			short pnsSkorKebutuhanPns, short pnsSkorPengadaanPns,
			short pnsSkorPangkatJabatan, short pnsSkorPengembanganKarirPns,
			short pnsSkorDiklat, short pnsSkorPolaKarirPns,
			short pnsSkorPromosi, short pnsSkorMutasiPns,
			short pnsSkorPenilaianKinerja, short pnsSkorGajiTunjangan,
			short pnsSkorPenghargaan, short pnsSkorDisiplin,
			short pnsSkorPemberhentianPns, short pnsSkorPensiunJaminanHariTua,
			short pnsSkorPerlindungan, short pnsSkorTotal,
			Date tglAwalAuditKriteria, Date tglAkhirAuditKriteria,
			String hasilEvaluasiAudit, String statusEvaluasiAudit,
			String loginIdAuditCreate) {
		this.id = id;
		this.tahunAudit = tahunAudit;
		this.instansiId = instansiId;
		this.loginIdIsiCreate = loginIdIsiCreate;
		this.tglAwalIsiKriteria = tglAwalIsiKriteria;
		this.tglAkhirIsiKriteria = tglAkhirIsiKriteria;
		this.statusIsi = statusIsi;
		this.pnsSkorKebutuhanPns = pnsSkorKebutuhanPns;
		this.pnsSkorPengadaanPns = pnsSkorPengadaanPns;
		this.pnsSkorPangkatJabatan = pnsSkorPangkatJabatan;
		this.pnsSkorPengembanganKarirPns = pnsSkorPengembanganKarirPns;
		this.pnsSkorDiklat = pnsSkorDiklat;
		this.pnsSkorPolaKarirPns = pnsSkorPolaKarirPns;
		this.pnsSkorPromosi = pnsSkorPromosi;
		this.pnsSkorMutasiPns = pnsSkorMutasiPns;
		this.pnsSkorPenilaianKinerja = pnsSkorPenilaianKinerja;
		this.pnsSkorGajiTunjangan = pnsSkorGajiTunjangan;
		this.pnsSkorPenghargaan = pnsSkorPenghargaan;
		this.pnsSkorDisiplin = pnsSkorDisiplin;
		this.pnsSkorPemberhentianPns = pnsSkorPemberhentianPns;
		this.pnsSkorPensiunJaminanHariTua = pnsSkorPensiunJaminanHariTua;
		this.pnsSkorPerlindungan = pnsSkorPerlindungan;
		this.pnsSkorTotal = pnsSkorTotal;
		this.tglAwalAuditKriteria = tglAwalAuditKriteria;
		this.tglAkhirAuditKriteria = tglAkhirAuditKriteria;
		this.hasilEvaluasiAudit = hasilEvaluasiAudit;
		this.statusEvaluasiAudit = statusEvaluasiAudit;
		this.loginIdAuditCreate = loginIdAuditCreate;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "TAHUN_AUDIT", nullable = false, length = 4)
	public String getTahunAudit() {
		return this.tahunAudit;
	}

	public void setTahunAudit(String tahunAudit) {
		this.tahunAudit = tahunAudit;
	}

	@Column(name = "INSTANSI_ID", nullable = false, length = 32)
	public String getInstansiId() {
		return this.instansiId;
	}

	public void setInstansiId(String instansiId) {
		this.instansiId = instansiId;
	}

	@Column(name = "LOGIN_ID_ISI_CREATE", nullable = false, length = 32)
	public String getLoginIdIsiCreate() {
		return this.loginIdIsiCreate;
	}

	public void setLoginIdIsiCreate(String loginIdIsiCreate) {
		this.loginIdIsiCreate = loginIdIsiCreate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TGL_AWAL_ISI_KRITERIA", nullable = false, length = 19)
	public Date getTglAwalIsiKriteria() {
		return this.tglAwalIsiKriteria;
	}

	public void setTglAwalIsiKriteria(Date tglAwalIsiKriteria) {
		this.tglAwalIsiKriteria = tglAwalIsiKriteria;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TGL_AKHIR_ISI_KRITERIA", nullable = false, length = 19)
	public Date getTglAkhirIsiKriteria() {
		return this.tglAkhirIsiKriteria;
	}

	public void setTglAkhirIsiKriteria(Date tglAkhirIsiKriteria) {
		this.tglAkhirIsiKriteria = tglAkhirIsiKriteria;
	}

	@Column(name = "STATUS_ISI", nullable = false, length = 1)
	public String getStatusIsi() {
		return this.statusIsi;
	}

	public void setStatusIsi(String statusIsi) {
		this.statusIsi = statusIsi;
	}

	@Column(name = "PNS_SKOR_KEBUTUHAN_PNS", nullable = false)
	public short getPnsSkorKebutuhanPns() {
		return this.pnsSkorKebutuhanPns;
	}

	public void setPnsSkorKebutuhanPns(short pnsSkorKebutuhanPns) {
		this.pnsSkorKebutuhanPns = pnsSkorKebutuhanPns;
	}

	@Column(name = "PNS_SKOR_PENGADAAN_PNS", nullable = false)
	public short getPnsSkorPengadaanPns() {
		return this.pnsSkorPengadaanPns;
	}

	public void setPnsSkorPengadaanPns(short pnsSkorPengadaanPns) {
		this.pnsSkorPengadaanPns = pnsSkorPengadaanPns;
	}

	@Column(name = "PNS_SKOR_PANGKAT_JABATAN", nullable = false)
	public short getPnsSkorPangkatJabatan() {
		return this.pnsSkorPangkatJabatan;
	}

	public void setPnsSkorPangkatJabatan(short pnsSkorPangkatJabatan) {
		this.pnsSkorPangkatJabatan = pnsSkorPangkatJabatan;
	}

	@Column(name = "PNS_SKOR_PENGEMBANGAN_KARIR_PNS", nullable = false)
	public short getPnsSkorPengembanganKarirPns() {
		return this.pnsSkorPengembanganKarirPns;
	}

	public void setPnsSkorPengembanganKarirPns(short pnsSkorPengembanganKarirPns) {
		this.pnsSkorPengembanganKarirPns = pnsSkorPengembanganKarirPns;
	}

	@Column(name = "PNS_SKOR_DIKLAT", nullable = false)
	public short getPnsSkorDiklat() {
		return this.pnsSkorDiklat;
	}

	public void setPnsSkorDiklat(short pnsSkorDiklat) {
		this.pnsSkorDiklat = pnsSkorDiklat;
	}

	@Column(name = "PNS_SKOR_POLA_KARIR_PNS", nullable = false)
	public short getPnsSkorPolaKarirPns() {
		return this.pnsSkorPolaKarirPns;
	}

	public void setPnsSkorPolaKarirPns(short pnsSkorPolaKarirPns) {
		this.pnsSkorPolaKarirPns = pnsSkorPolaKarirPns;
	}

	@Column(name = "PNS_SKOR_PROMOSI", nullable = false)
	public short getPnsSkorPromosi() {
		return this.pnsSkorPromosi;
	}

	public void setPnsSkorPromosi(short pnsSkorPromosi) {
		this.pnsSkorPromosi = pnsSkorPromosi;
	}

	@Column(name = "PNS_SKOR_MUTASI_PNS", nullable = false)
	public short getPnsSkorMutasiPns() {
		return this.pnsSkorMutasiPns;
	}

	public void setPnsSkorMutasiPns(short pnsSkorMutasiPns) {
		this.pnsSkorMutasiPns = pnsSkorMutasiPns;
	}

	@Column(name = "PNS_SKOR_PENILAIAN_KINERJA", nullable = false)
	public short getPnsSkorPenilaianKinerja() {
		return this.pnsSkorPenilaianKinerja;
	}

	public void setPnsSkorPenilaianKinerja(short pnsSkorPenilaianKinerja) {
		this.pnsSkorPenilaianKinerja = pnsSkorPenilaianKinerja;
	}

	@Column(name = "PNS_SKOR_GAJI_TUNJANGAN", nullable = false)
	public short getPnsSkorGajiTunjangan() {
		return this.pnsSkorGajiTunjangan;
	}

	public void setPnsSkorGajiTunjangan(short pnsSkorGajiTunjangan) {
		this.pnsSkorGajiTunjangan = pnsSkorGajiTunjangan;
	}

	@Column(name = "PNS_SKOR_PENGHARGAAN", nullable = false)
	public short getPnsSkorPenghargaan() {
		return this.pnsSkorPenghargaan;
	}

	public void setPnsSkorPenghargaan(short pnsSkorPenghargaan) {
		this.pnsSkorPenghargaan = pnsSkorPenghargaan;
	}

	@Column(name = "PNS_SKOR_DISIPLIN", nullable = false)
	public short getPnsSkorDisiplin() {
		return this.pnsSkorDisiplin;
	}

	public void setPnsSkorDisiplin(short pnsSkorDisiplin) {
		this.pnsSkorDisiplin = pnsSkorDisiplin;
	}

	@Column(name = "PNS_SKOR_PEMBERHENTIAN_PNS", nullable = false)
	public short getPnsSkorPemberhentianPns() {
		return this.pnsSkorPemberhentianPns;
	}

	public void setPnsSkorPemberhentianPns(short pnsSkorPemberhentianPns) {
		this.pnsSkorPemberhentianPns = pnsSkorPemberhentianPns;
	}

	@Column(name = "PNS_SKOR_PENSIUN_JAMINAN_HARI_TUA", nullable = false)
	public short getPnsSkorPensiunJaminanHariTua() {
		return this.pnsSkorPensiunJaminanHariTua;
	}

	public void setPnsSkorPensiunJaminanHariTua(
			short pnsSkorPensiunJaminanHariTua) {
		this.pnsSkorPensiunJaminanHariTua = pnsSkorPensiunJaminanHariTua;
	}

	@Column(name = "PNS_SKOR_PERLINDUNGAN", nullable = false)
	public short getPnsSkorPerlindungan() {
		return this.pnsSkorPerlindungan;
	}

	public void setPnsSkorPerlindungan(short pnsSkorPerlindungan) {
		this.pnsSkorPerlindungan = pnsSkorPerlindungan;
	}

	@Column(name = "PNS_SKOR_TOTAL", nullable = false)
	public short getPnsSkorTotal() {
		return this.pnsSkorTotal;
	}

	public void setPnsSkorTotal(short pnsSkorTotal) {
		this.pnsSkorTotal = pnsSkorTotal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TGL_AWAL_AUDIT_KRITERIA", nullable = false, length = 19)
	public Date getTglAwalAuditKriteria() {
		return this.tglAwalAuditKriteria;
	}

	public void setTglAwalAuditKriteria(Date tglAwalAuditKriteria) {
		this.tglAwalAuditKriteria = tglAwalAuditKriteria;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TGL_AKHIR_AUDIT_KRITERIA", nullable = false, length = 19)
	public Date getTglAkhirAuditKriteria() {
		return this.tglAkhirAuditKriteria;
	}

	public void setTglAkhirAuditKriteria(Date tglAkhirAuditKriteria) {
		this.tglAkhirAuditKriteria = tglAkhirAuditKriteria;
	}

	@Column(name = "HASIL_EVALUASI_AUDIT", nullable = false, length = 16777215)
	public String getHasilEvaluasiAudit() {
		return this.hasilEvaluasiAudit;
	}

	public void setHasilEvaluasiAudit(String hasilEvaluasiAudit) {
		this.hasilEvaluasiAudit = hasilEvaluasiAudit;
	}

	@Column(name = "STATUS_EVALUASI_AUDIT", nullable = false, length = 1)
	public String getStatusEvaluasiAudit() {
		return this.statusEvaluasiAudit;
	}

	public void setStatusEvaluasiAudit(String statusEvaluasiAudit) {
		this.statusEvaluasiAudit = statusEvaluasiAudit;
	}

	@Column(name = "LOGIN_ID_AUDIT_CREATE", nullable = false, length = 32)
	public String getLoginIdAuditCreate() {
		return this.loginIdAuditCreate;
	}

	public void setLoginIdAuditCreate(String loginIdAuditCreate) {
		this.loginIdAuditCreate = loginIdAuditCreate;
	}

}
