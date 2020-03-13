public class Piano {

    private String model = "Модель пианино не указана";
    private String note = "Клавиши не нажаты";
    private String settings = "Пианино не настроено";

    public Keys k = new Keys();

    Piano(String model,String note, String settings)
    {
        this.model = model;
        this.note = note;
        this.settings = settings;
    }

    public void setPianoname(String model)
    {
        model = model;
    }

    public String getPianoname()
    {
        return model;
    }

    // Метод "Настроить"
    public String configure()
    {
        return Piano.this.settings="Пианино настроено";
    }

    // Метод "Играть на пианино"
    public String playPiano()
    {
        return Piano.this.note="Пианино играет";
    }

    @Override
    public String toString() {
        return "Piano{" +
                "model='" + model + '\'' +
                ", note='" + note + '\'' +
                ", settings='" + settings + '\'' +
                ", k=" + k +
                '}';
    }
}
