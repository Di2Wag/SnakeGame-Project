package fruits;


public enum FruitType {
        BERRY("resources/berry.png"),
        ORANGE("resources/orange.png"),
        PINEAPPLE("resources/pineapple.png"),
        STRAWBERRY("resources/strawberry.png");

        private String imagePath;

        FruitType(String imagePath) {
                this.imagePath = imagePath;

        }

        public String getImagePath() {
                return imagePath;
        }

        public static FruitType getFruitType() {
                int value = (int) (Math.random() * 4);

                switch (value) {
                        case 0:
                                return BERRY;

                        case 1:
                                return ORANGE;

                        case 2:
                                return PINEAPPLE;

                        case 3:
                                return STRAWBERRY;

                        default:
                                System.out.println("Invalid FruitType");

                }

                return null;
        }

}

















