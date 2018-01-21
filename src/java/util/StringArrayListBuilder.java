package util;

import java.util.ArrayList;
import java.util.List;

public class StringArrayListBuilder {

    List<String[]> list = null;

    public StringArrayListBuilder() {
        list = new ArrayList<String[]>();
    }

    public StringArrayListBuilder(List<String[]> list) {
        super();
        this.list = list;
    }

    public StringArrayListBuilder addString(String... strs) {
        list.add(strs);
        return this;
    }

    public List<String[]> build() {
        return list;
    }

}
