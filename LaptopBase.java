package Homework.JAVA_HW6;

public class LaptopBase {

    private String manufacturer; //Производитель 
    private String model; // Модель компьютера
    private String operatingSystem; //Операционная система
    private float rAM; // Объём Оперативная память ГБ
    private float hDD; // Объём жёсткого диска
    private String processor; // Процессор
    private String videoCard; // Видеокарта
    private String color; //Цвет

    
    public LaptopBase(String manufacturer, String model, String operatingSystem, float rAM,
            float hDD, String processor, String videoCard, String color) //Метод
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.rAM = rAM;
        this.hDD = hDD;
        this.processor = processor;
        this.videoCard = videoCard;
        this.color = color;
    }


    public String getManufacturer() {
        return manufacturer;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getOperatingSystem() {
        return operatingSystem;
    }


    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    public float getRAM() {
        return rAM;
    }


    public void setRAM(float rAM) {
        this.rAM = rAM;
    }


    public float getHDD() {
        return hDD;
    }


    public void setHDD(float hDD) {
        this.hDD = hDD;
    }


    public String getProcessor() {
        return processor;
    }


    public void setProcessor(String processor) {
        this.processor = processor;
    }


    public String getVideoCard() {
        return videoCard;
    }


    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return 
        "\nПроизводитель = "+ manufacturer 
        + "\nМодель = " + model
        + "\nОперационная  система = " + operatingSystem
        + "\nОбъём оперативной памяти ГБ = " + rAM
        + "\nОбъём жёсткого диска ГБ = " + hDD
        + ",\nПроцессор = " + processor
        + "\nВидеокарта = " + videoCard 
        + "\nЦвет = " + color + "\n";

    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
        result = prime * result + Float.floatToIntBits(rAM);
        result = prime * result + Float.floatToIntBits(hDD);
        result = prime * result + ((processor == null) ? 0 : processor.hashCode());
        result = prime * result + ((videoCard == null) ? 0 : videoCard.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LaptopBase other = (LaptopBase) obj;
        if (manufacturer == null) {
            if (other.manufacturer != null)
                return false;
        } else if (!manufacturer.equals(other.manufacturer))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (operatingSystem == null) {
            if (other.operatingSystem != null)
                return false;
        } else if (!operatingSystem.equals(other.operatingSystem))
            return false;
        if (Float.floatToIntBits(rAM) != Float.floatToIntBits(other.rAM))
            return false;
        if (Float.floatToIntBits(hDD) != Float.floatToIntBits(other.hDD))
            return false;
        if (processor == null) {
            if (other.processor != null)
                return false;
        } else if (!processor.equals(other.processor))
            return false;
        if (videoCard == null) {
            if (other.videoCard != null)
                return false;
        } else if (!videoCard.equals(other.videoCard))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }


     
    
    

    
}
