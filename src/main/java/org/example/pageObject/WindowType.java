
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
    package org.example.pageObject;

    public enum WindowType {
        WINDOW("window"),
        TAB("tab");

        private final String text;

        private WindowType(String text) {
            this.text = text;
        }

        public String toString() {
            return String.valueOf(this.text);
        }

        public static WindowType fromString(String text) {
            if (text != null) {
                WindowType[] var1 = values();
                int var2 = var1.length;

                for(int var3 = 0; var3 < var2; ++var3) {
                    WindowType b = var1[var3];
                    if (text.equalsIgnoreCase(b.text)) {
                        return b;
                    }
                }
            }

            return null;
        }
    }


