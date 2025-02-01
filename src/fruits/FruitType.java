package fruits;


public enum FruitType {
        BERRY("resources/cherry (1).png"),
        ORANGE("resources/orange (1).png"),
        PINEAPPLE("resources/pineapple (1).png"),
        WATERMELON("resources/watermelon.png"),
        BLUEBERRY("resources/blueberry.png"),
        STRAWBERRY("resources/strawberry (1).png");

        private String imagePath;

        FruitType(String imagePath) {
                this.imagePath = imagePath;

        }

        public String getImagePath() {
                return imagePath;
        }

        public static FruitType getFruitType() {
                int value = (int) (Math.random() *6);

                switch (value) {
                        case 0:
                                return BERRY;

                        case 1:
                                return ORANGE;

                        case 2:
                                return PINEAPPLE;

                        case 3:
                                return STRAWBERRY;

                        case 4:
                                return BLUEBERRY;

                        case 5:
                                return WATERMELON;

                        default:
                                System.out.println("Invalid FruitType");

                }

                return null;
        }

}

















