
    package java_addtional_practices;

    public class Kare extends Dikdortgen {
        public Kare(double uzunkenar, double kisakenar) {
            super(uzunkenar, kisakenar);
        }

        @Override
        public String toString() {
            return "Karenin kenari =" + uzunkenar +
                    " Karenin alani: " + alanhesaplama(uzunkenar,kisakenar)+
                    " Karenin cevresi: " + cevrehesaplama(uzunkenar,kisakenar);
        }
    }
