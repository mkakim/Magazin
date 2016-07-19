package clients;
import interfaces.ClientInterface;
    public class BaseClient implements ClientInterface {
        private String name;
        private String shoppingCard;

        public BaseClient(String name, String shoppingCard) {
            this.name = name;
            this.shoppingCard = shoppingCard;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setShoppingCard(String shoppingCard) {
            this.shoppingCard = shoppingCard;
        }

        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public String getShoppingCard() {
            return this.shoppingCard;
        }

        @Override
        public void buy() {

        }
    }

