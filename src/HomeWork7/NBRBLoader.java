package HomeWork7;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        String currencyRate = "\"Cur_OfficialRate\":";
        double value = 0;
        int firstIndex = content.indexOf(currencyRate) + currencyRate.length();
        int lastIndex = content.length() - 2;

        try{
            value = Double.parseDouble(content.substring(firstIndex, lastIndex));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return value;
    }
}



