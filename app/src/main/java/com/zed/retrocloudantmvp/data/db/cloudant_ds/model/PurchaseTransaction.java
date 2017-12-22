package com.zed.retrocloudantmvp.data.db.cloudant_ds.model;

/**
 * Created by airfi on 06/12/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PurchaseTransaction {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("_rev")
    @Expose
    private String rev;
    @SerializedName("line_items")
    @Expose
    private List<LineItem> lineItems = null;
    @SerializedName("total_purchase_value")
    @Expose
    private String totalPurchaseValue;
    @SerializedName("flight_metadata")
    @Expose
    private FlightMetadata flightMetadata;
    @SerializedName("number_of_reprint")
    @Expose
    private Integer numberOfReprint;
    @SerializedName("modification_allowed")
    @Expose
    private Boolean modificationAllowed;
    @SerializedName("transaction_currency")
    @Expose
    private TransactionCurrency transactionCurrency;
    @SerializedName("flight_leg_identifier")
    @Expose
    private FlightLegIdentifier flightLegIdentifier;
    @SerializedName("completed")
    @Expose
    private Boolean completed;
    @SerializedName("payment_method")
    @Expose
    private String paymentMethod;
    @SerializedName("payment_status")
    @Expose
    private String paymentStatus;
    @SerializedName("print_receipt")
    @Expose
    private Boolean printReceipt;
    @SerializedName("printing_successful")
    @Expose
    private Boolean printingSuccessful;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sync_with_server")
    @Expose
    private Boolean syncWithServer;
    @SerializedName("receipt_number")
    @Expose
    private Integer receiptNumber;
    @SerializedName("tablet_id")
    @Expose
    private String tabletId;
    @SerializedName("last_payment_status_update")
    @Expose
    private String lastPaymentStatusUpdate;
    @SerializedName("airline_iata_code")
    @Expose
    private String airlineIataCode;
    @SerializedName("split_refunds")
    @Expose
    private List<Object> splitRefunds = null;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("split_payments")
    @Expose
    private List<SplitPayment> splitPayments = null;
    @SerializedName("signature_card")
    @Expose
    private Boolean signatureCard;
    @SerializedName("order_identifier")
    @Expose
    private String orderIdentifier;
    @SerializedName("employee_identifier")
    @Expose
    private String employeeIdentifier;
    @SerializedName("total_purchase_value_as_string")
    @Expose
    private String totalPurchaseValueAsString;
    @SerializedName("payment_device")
    @Expose
    private String paymentDevice;
    @SerializedName("refunded")
    @Expose
    private Boolean refunded;
    @SerializedName("receipt_metadata")
    @Expose
    private ReceiptMetadata receiptMetadata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String getTotalPurchaseValue() {
        return totalPurchaseValue;
    }

    public void setTotalPurchaseValue(String totalPurchaseValue) {
        this.totalPurchaseValue = totalPurchaseValue;
    }

    public FlightMetadata getFlightMetadata() {
        return flightMetadata;
    }

    public void setFlightMetadata(FlightMetadata flightMetadata) {
        this.flightMetadata = flightMetadata;
    }

    public Integer getNumberOfReprint() {
        return numberOfReprint;
    }

    public void setNumberOfReprint(Integer numberOfReprint) {
        this.numberOfReprint = numberOfReprint;
    }

    public Boolean getModificationAllowed() {
        return modificationAllowed;
    }

    public void setModificationAllowed(Boolean modificationAllowed) {
        this.modificationAllowed = modificationAllowed;
    }

    public TransactionCurrency getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(TransactionCurrency transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public FlightLegIdentifier getFlightLegIdentifier() {
        return flightLegIdentifier;
    }

    public void setFlightLegIdentifier(FlightLegIdentifier flightLegIdentifier) {
        this.flightLegIdentifier = flightLegIdentifier;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Boolean getPrintReceipt() {
        return printReceipt;
    }

    public void setPrintReceipt(Boolean printReceipt) {
        this.printReceipt = printReceipt;
    }

    public Boolean getPrintingSuccessful() {
        return printingSuccessful;
    }

    public void setPrintingSuccessful(Boolean printingSuccessful) {
        this.printingSuccessful = printingSuccessful;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSyncWithServer() {
        return syncWithServer;
    }

    public void setSyncWithServer(Boolean syncWithServer) {
        this.syncWithServer = syncWithServer;
    }

    public Integer getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(Integer receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getTabletId() {
        return tabletId;
    }

    public void setTabletId(String tabletId) {
        this.tabletId = tabletId;
    }

    public String getLastPaymentStatusUpdate() {
        return lastPaymentStatusUpdate;
    }

    public void setLastPaymentStatusUpdate(String lastPaymentStatusUpdate) {
        this.lastPaymentStatusUpdate = lastPaymentStatusUpdate;
    }

    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    public void setAirlineIataCode(String airlineIataCode) {
        this.airlineIataCode = airlineIataCode;
    }

    public List<Object> getSplitRefunds() {
        return splitRefunds;
    }

    public void setSplitRefunds(List<Object> splitRefunds) {
        this.splitRefunds = splitRefunds;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public List<SplitPayment> getSplitPayments() {
        return splitPayments;
    }

    public void setSplitPayments(List<SplitPayment> splitPayments) {
        this.splitPayments = splitPayments;
    }

    public Boolean getSignatureCard() {
        return signatureCard;
    }

    public void setSignatureCard(Boolean signatureCard) {
        this.signatureCard = signatureCard;
    }

    public String getOrderIdentifier() {
        return orderIdentifier;
    }

    public void setOrderIdentifier(String orderIdentifier) {
        this.orderIdentifier = orderIdentifier;
    }

    public String getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    public void setEmployeeIdentifier(String employeeIdentifier) {
        this.employeeIdentifier = employeeIdentifier;
    }

    public String getTotalPurchaseValueAsString() {
        return totalPurchaseValueAsString;
    }

    public void setTotalPurchaseValueAsString(String totalPurchaseValueAsString) {
        this.totalPurchaseValueAsString = totalPurchaseValueAsString;
    }

    public String getPaymentDevice() {
        return paymentDevice;
    }

    public void setPaymentDevice(String paymentDevice) {
        this.paymentDevice = paymentDevice;
    }

    public Boolean getRefunded() {
        return refunded;
    }

    public void setRefunded(Boolean refunded) {
        this.refunded = refunded;
    }

    public ReceiptMetadata getReceiptMetadata() {
        return receiptMetadata;
    }

    public void setReceiptMetadata(ReceiptMetadata receiptMetadata) {
        this.receiptMetadata = receiptMetadata;
    }


    public class TransactionCurrency {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("symbol")
        @Expose
        private String symbol;
        @SerializedName("format_string")
        @Expose
        private String formatString;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getFormatString() {
            return formatString;
        }

        public void setFormatString(String formatString) {
            this.formatString = formatString;
        }
    }

    public class ReceiptMetadata {

        @SerializedName("printer")
        @Expose
        private List<String> printer = null;
        @SerializedName("show_amount_being_paid")
        @Expose
        private Boolean showAmountBeingPaid;
        @SerializedName("card_default_enabled")
        @Expose
        private Boolean cardDefaultEnabled;
        @SerializedName("cash_default_enabled")
        @Expose
        private Boolean cashDefaultEnabled;
        @SerializedName("receipt_footer")
        @Expose
        private List<String> receiptFooter = null;
        @SerializedName("receipt_header")
        @Expose
        private String receiptHeader;
        @SerializedName("receipt_sub_header")
        @Expose
        private List<String> receiptSubHeader = null;
        @SerializedName("show_additional_card_data")
        @Expose
        private Boolean showAdditionalCardData;
        @SerializedName("show_flight_data")
        @Expose
        private Boolean showFlightData;
        @SerializedName("show_merchant_ref")
        @Expose
        private Boolean showMerchantRef;
        @SerializedName("show_product_line_items")
        @Expose
        private Boolean showProductLineItems;

        public List<String> getPrinter() {
            return printer;
        }

        public void setPrinter(List<String> printer) {
            this.printer = printer;
        }

        public Boolean getShowAmountBeingPaid() {
            return showAmountBeingPaid;
        }

        public void setShowAmountBeingPaid(Boolean showAmountBeingPaid) {
            this.showAmountBeingPaid = showAmountBeingPaid;
        }

        public Boolean getCardDefaultEnabled() {
            return cardDefaultEnabled;
        }

        public void setCardDefaultEnabled(Boolean cardDefaultEnabled) {
            this.cardDefaultEnabled = cardDefaultEnabled;
        }

        public Boolean getCashDefaultEnabled() {
            return cashDefaultEnabled;
        }

        public void setCashDefaultEnabled(Boolean cashDefaultEnabled) {
            this.cashDefaultEnabled = cashDefaultEnabled;
        }

        public List<String> getReceiptFooter() {
            return receiptFooter;
        }

        public void setReceiptFooter(List<String> receiptFooter) {
            this.receiptFooter = receiptFooter;
        }

        public String getReceiptHeader() {
            return receiptHeader;
        }

        public void setReceiptHeader(String receiptHeader) {
            this.receiptHeader = receiptHeader;
        }

        public List<String> getReceiptSubHeader() {
            return receiptSubHeader;
        }

        public void setReceiptSubHeader(List<String> receiptSubHeader) {
            this.receiptSubHeader = receiptSubHeader;
        }

        public Boolean getShowAdditionalCardData() {
            return showAdditionalCardData;
        }

        public void setShowAdditionalCardData(Boolean showAdditionalCardData) {
            this.showAdditionalCardData = showAdditionalCardData;
        }

        public Boolean getShowFlightData() {
            return showFlightData;
        }

        public void setShowFlightData(Boolean showFlightData) {
            this.showFlightData = showFlightData;
        }

        public Boolean getShowMerchantRef() {
            return showMerchantRef;
        }

        public void setShowMerchantRef(Boolean showMerchantRef) {
            this.showMerchantRef = showMerchantRef;
        }

        public Boolean getShowProductLineItems() {
            return showProductLineItems;
        }

        public void setShowProductLineItems(Boolean showProductLineItems) {
            this.showProductLineItems = showProductLineItems;
        }

    }


    public class SplitPayment {

        @SerializedName("amount")
        @Expose
        private Integer amount;
        @SerializedName("currency")
        @Expose
        private Currency_ currency;
        @SerializedName("method")
        @Expose
        private String method;
        @SerializedName("status")
        @Expose
        private String status;

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Currency_ getCurrency() {
            return currency;
        }

        public void setCurrency(Currency_ currency) {
            this.currency = currency;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

    public class CommercialPrice {

        @SerializedName("currency")
        @Expose
        private Currency currency;
        @SerializedName("price")
        @Expose
        private Integer price;

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

    }


    public class Currency {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("symbol")
        @Expose
        private String symbol;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

    }

    public class Currency_ {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("symbol")
        @Expose
        private String symbol;
        @SerializedName("format_string")
        @Expose
        private String formatString;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getFormatString() {
            return formatString;
        }

        public void setFormatString(String formatString) {
            this.formatString = formatString;
        }

    }


    public class FlightLegIdentifier {

        @SerializedName("flight_number")
        @Expose
        private String flightNumber;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("origin")
        @Expose
        private String origin;
        @SerializedName("destination")
        @Expose
        private String destination;

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

    }


    public class FlightMetadata {

        @SerializedName("flight_key")
        @Expose
        private String flightKey;
        @SerializedName("flight_key_entry_mode")
        @Expose
        private String flightKeyEntryMode;

        public String getFlightKey() {
            return flightKey;
        }

        public void setFlightKey(String flightKey) {
            this.flightKey = flightKey;
        }

        public String getFlightKeyEntryMode() {
            return flightKeyEntryMode;
        }

        public void setFlightKeyEntryMode(String flightKeyEntryMode) {
            this.flightKeyEntryMode = flightKeyEntryMode;
        }

    }

    public class LineItem {

        @SerializedName("product")
        @Expose
        private Product product;
        @SerializedName("quantity")
        @Expose
        private Integer quantity;
        @SerializedName("denied")
        @Expose
        private Boolean denied;
        @SerializedName("add_to_sales")
        @Expose
        private Boolean addToSales;
        @SerializedName("number_of_complementary_products")
        @Expose
        private Integer numberOfComplementaryProducts;

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Boolean getDenied() {
            return denied;
        }

        public void setDenied(Boolean denied) {
            this.denied = denied;
        }

        public Boolean getAddToSales() {
            return addToSales;
        }

        public void setAddToSales(Boolean addToSales) {
            this.addToSales = addToSales;
        }

        public Integer getNumberOfComplementaryProducts() {
            return numberOfComplementaryProducts;
        }

        public void setNumberOfComplementaryProducts(Integer numberOfComplementaryProducts) {
            this.numberOfComplementaryProducts = numberOfComplementaryProducts;
        }

    }


    public class Product {

        @SerializedName("airline_iata_code")
        @Expose
        private String airlineIataCode;
        @SerializedName("product_id")
        @Expose
        private String productId;
        @SerializedName("price")
        @Expose
        private String price;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("company_code")
        @Expose
        private String companyCode;
        @SerializedName("catalog")
        @Expose
        private String catalog;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("menus")
        @Expose
        private List<String> menus = null;
        @SerializedName("raw_price")
        @Expose
        private Integer rawPrice;
        @SerializedName("discounted")
        @Expose
        private Boolean discounted;
        @SerializedName("open_amount")
        @Expose
        private Boolean openAmount;
        @SerializedName("commercial_prices")
        @Expose
        private List<CommercialPrice> commercialPrices = null;
        @SerializedName("complementary_allowed")
        @Expose
        private Boolean complementaryAllowed;
        @SerializedName("currency_code")
        @Expose
        private String currencyCode;
        @SerializedName("currency_symbol")
        @Expose
        private String currencySymbol;
        @SerializedName("default_sort_order")
        @Expose
        private Integer defaultSortOrder;
        @SerializedName("long_description")
        @Expose
        private String longDescription;
        @SerializedName("product_start_date")
        @Expose
        private String productStartDate;
        @SerializedName("product_type")
        @Expose
        private String productType;
        @SerializedName("product_without_stock")
        @Expose
        private Boolean productWithoutStock;
        @SerializedName("short_description")
        @Expose
        private String shortDescription;

        public String getAirlineIataCode() {
            return airlineIataCode;
        }

        public void setAirlineIataCode(String airlineIataCode) {
            this.airlineIataCode = airlineIataCode;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCompanyCode() {
            return companyCode;
        }

        public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public List<String> getMenus() {
            return menus;
        }

        public void setMenus(List<String> menus) {
            this.menus = menus;
        }

        public Integer getRawPrice() {
            return rawPrice;
        }

        public void setRawPrice(Integer rawPrice) {
            this.rawPrice = rawPrice;
        }

        public Boolean getDiscounted() {
            return discounted;
        }

        public void setDiscounted(Boolean discounted) {
            this.discounted = discounted;
        }

        public Boolean getOpenAmount() {
            return openAmount;
        }

        public void setOpenAmount(Boolean openAmount) {
            this.openAmount = openAmount;
        }

        public List<CommercialPrice> getCommercialPrices() {
            return commercialPrices;
        }

        public void setCommercialPrices(List<CommercialPrice> commercialPrices) {
            this.commercialPrices = commercialPrices;
        }

        public Boolean getComplementaryAllowed() {
            return complementaryAllowed;
        }

        public void setComplementaryAllowed(Boolean complementaryAllowed) {
            this.complementaryAllowed = complementaryAllowed;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getCurrencySymbol() {
            return currencySymbol;
        }

        public void setCurrencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
        }

        public Integer getDefaultSortOrder() {
            return defaultSortOrder;
        }

        public void setDefaultSortOrder(Integer defaultSortOrder) {
            this.defaultSortOrder = defaultSortOrder;
        }

        public String getLongDescription() {
            return longDescription;
        }

        public void setLongDescription(String longDescription) {
            this.longDescription = longDescription;
        }

        public String getProductStartDate() {
            return productStartDate;
        }

        public void setProductStartDate(String productStartDate) {
            this.productStartDate = productStartDate;
        }

        public String getProductType() {
            return productType;
        }

        public void setProductType(String productType) {
            this.productType = productType;
        }

        public Boolean getProductWithoutStock() {
            return productWithoutStock;
        }

        public void setProductWithoutStock(Boolean productWithoutStock) {
            this.productWithoutStock = productWithoutStock;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

    }
}








