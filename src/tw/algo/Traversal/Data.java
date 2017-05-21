package tw.algo.Traversal;

/**
 * Created by chiachen on 2017/5/21.
 */
public class Data {
    public Data right,left;
    public Object data;

    private Data(DataBuilder dataBuilder) {
        this.right = dataBuilder.right;
        this.left = dataBuilder.left;
        this.data = dataBuilder.data;
    }

    static class DataBuilder {
        private Data right,left;
        private Object data;

        public DataBuilder(Object data) {
            this.data = data;
        }

        public DataBuilder setRight(Data right) {

            this.right = right;
            return this;
        }

        public DataBuilder setLeft(Data left) {

            this.left = left;
            return this;
        }

        public Data build() {

            return new Data(this);
        }
    }
}
