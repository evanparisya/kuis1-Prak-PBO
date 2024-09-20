public class Handphone {
    private String noSeri, model, versiOs;
    private boolean on;
    private int volume;
    private int lastVolume;

    public Handphone(){
        this.on = false;
        this.volume = 0;
    }

    public Handphone(String noSeri, String model, String versiOs){
        this();
        this.noSeri = noSeri;
        this.model = model;
        this.versiOs = versiOs;
    }

    public void power(){
        this.on = !this.on;
        if (!this.on) {
            this.volume = 0;
        }
    }

    public void tambahVolume(){
        if (this.on && this.volume < 100) {
            this.volume++;
        }
    }

    public void kurangVolume(){
        if (this.on && this.volume > 0) {
            this.volume--;
        }
    }

    public void mute(){
        if (this.on) {
            this.lastVolume = this.volume;
            this.volume = 0;
        }
    }

    public void unmute(){
        if (this.on) {
            this.volume = this.lastVolume; 
        }
    }

    public void info(){
        System.out.println("===== HandPhone =====");
        System.out.println("No. Seri : " + this.noSeri);
        System.out.println("Model    : " + this.model);
        System.out.println("Versi OS : " + this.versiOs);
        System.out.println("Status   : " + (this.on ? "ON" : "OFF"));
        System.out.println("Volume   : " + this.volume);
    }

    public String getNoSeri(){
        return noSeri;
    }

    public void setNoSeri(String noSeri){
        this.noSeri = noSeri;
    }
    
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getVersiOs(){
        return versiOs;
    }

    public void setVersiOs(String versiOs){
        this.versiOs = versiOs;
    }

    public boolean isOn(){
        return on;
    }

    public int getVolume(){
        return volume;
    }


}
