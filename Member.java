public class Member implements Info {

    private String nama;
    private String noHp;
    private String email;
    private static int totalMember = 0;

    public Member(String nama, String noHp, String email) throws InvalidMemberDataException {
        if (nama == null || nama.trim().isEmpty()) {
            throw new InvalidMemberDataException("Nama tidak boleh kosong!");
        }
        if (noHp == null || !noHp.matches("\\d+")) {
            throw new InvalidMemberDataException("No HP hanya boleh berisi angka!");
        }
        if (email == null || !email.contains("@")) {
            throw new InvalidMemberDataException("Email tidak valid!");
        }
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;

        totalMember++;
    }
    public String getNama() {
        return nama;
    }
    public String getNoHp() {
        return noHp;
    }
    public String getEmail() {
        return email;
    }
    public static int getTotalMember() {
        return totalMember;
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("No HP  : " + noHp);
        System.out.println("Email  : " + email);
    }
}