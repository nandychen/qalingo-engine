/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.web.mvc.viewbean;

import java.util.ArrayList;
import java.util.List;

public class OrderViewBean extends AbstractViewBean {

	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = -7481342045685333815L;
	
    private String status;
    private String statusLabel;

    private String confirmationMessage;
    private String orderNum;

    private String expectedDeliveryDate;
    
    private String orderItemsTotalWithCurrencySign;
    private String orderShippingTotalWithCurrencySign;
    private String orderTaxesTotalWithCurrencySign;
    private String orderTotalWithCurrencySign;

    private String cardHolder;
    private String cardNumber;
    private String cardCrypto;
    private String cardExpirationDate;
    private String cardExpirationMonth;
    private String cardExpirationYear;

    private CustomerViewBean customer;
    private UserViewBean user;
    private OrderAddressViewBean billingAddress;
    private OrderAddressViewBean shippingAddress;

    private List<OrderItemViewBean> orderItems = new ArrayList<OrderItemViewBean>();
    private List<OrderShippingViewBean> orderShippings = new ArrayList<OrderShippingViewBean>();
    private List<OrderTaxViewBean> orderTaxes = new ArrayList<OrderTaxViewBean>();
    private List<OrderPaymentViewBean> payments = new ArrayList<OrderPaymentViewBean>();
    private List<OrderStateViewBean> states = new ArrayList<OrderStateViewBean>();

    private String detailsUrl;

	public OrderViewBean() {
	}
	
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatusLabel() {
        return statusLabel;
    }
    
    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }
    
    public String getConfirmationMessage() {
        return confirmationMessage;
    }
    
    public void setConfirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }
    
	public String getOrderNum() {
		return orderNum;
	}
	
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	
	public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }
	
	public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

	public String getOrderItemsTotalWithCurrencySign() {
        return orderItemsTotalWithCurrencySign;
    }

    public void setOrderItemsTotalWithCurrencySign(String orderItemsTotalWithCurrencySign) {
        this.orderItemsTotalWithCurrencySign = orderItemsTotalWithCurrencySign;
    }

    public String getOrderShippingTotalWithCurrencySign() {
        return orderShippingTotalWithCurrencySign;
    }

    public void setOrderShippingTotalWithCurrencySign(String orderShippingTotalWithCurrencySign) {
        this.orderShippingTotalWithCurrencySign = orderShippingTotalWithCurrencySign;
    }

    public String getOrderTaxesTotalWithCurrencySign() {
        return orderTaxesTotalWithCurrencySign;
    }

    public void setOrderTaxesTotalWithCurrencySign(String orderFeesTotalWithCurrencySign) {
        this.orderTaxesTotalWithCurrencySign = orderFeesTotalWithCurrencySign;
    }

    public String getOrderTotalWithCurrencySign() {
        return orderTotalWithCurrencySign;
    }

    public void setOrderTotalWithCurrencySign(String orderTotalWithCurrencySign) {
        this.orderTotalWithCurrencySign = orderTotalWithCurrencySign;
    }

    public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardCrypto() {
		return cardCrypto;
	}

	public void setCardCrypto(String cardCrypto) {
		this.cardCrypto = cardCrypto;
	}

	public String getCardExpirationDate() {
		return cardExpirationDate;
	}

	public void setCardExpirationDate(String cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}

	public String getCardExpirationMonth() {
		return cardExpirationMonth;
	}

	public void setCardExpirationMonth(String cardExpirationMonth) {
		this.cardExpirationMonth = cardExpirationMonth;
	}

	public String getCardExpirationYear() {
		return cardExpirationYear;
	}

	public void setCardExpirationYear(String cardExpirationYear) {
		this.cardExpirationYear = cardExpirationYear;
	}

	public CustomerViewBean getCustomer() {
        return customer;
    }
	
	public void setCustomer(CustomerViewBean customer) {
        this.customer = customer;
    }
	
    public UserViewBean getUser() {
        return user;
    }
    
    public void setUser(UserViewBean user) {
        this.user = user;
    }
    
    public OrderAddressViewBean getBillingAddress() {
        return billingAddress;
    }
    
    public void setBillingAddress(OrderAddressViewBean billingAddress) {
        this.billingAddress = billingAddress;
    }

    public OrderAddressViewBean getShippingAddress() {
        return shippingAddress;
    }
    
    public void setShippingAddress(OrderAddressViewBean shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    
    public List<OrderItemViewBean> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemViewBean> orderItems) {
		this.orderItems = orderItems;
	}
	
    public int getTotalCartItems() {
        if (orderItems != null) {
            return orderItems.size();
        }
        return 0;
    }
    
    public List<OrderShippingViewBean> getOrderShippings() {
        return orderShippings;
    }

    public void setOrderShippings(List<OrderShippingViewBean> orderShippings) {
        this.orderShippings = orderShippings;
    }

    public int getTotalOrderShippings() {
        if (orderShippings != null) {
            return orderShippings.size();
        }
        return 0;
    }
    
    public List<OrderTaxViewBean> getOrderTaxes() {
        return orderTaxes;
    }
    
    public void setOrderTaxes(List<OrderTaxViewBean> orderTaxes) {
        this.orderTaxes = orderTaxes;
    }
    
    public int getTotalOrderTaxes() {
        if (orderTaxes != null) {
            return orderTaxes.size();
        }
        return 0;
    }
    
    public List<OrderPaymentViewBean> getPayments() {
        return payments;
    }
    
    public OrderPaymentViewBean getPrincipalPayment() {
        if(payments != null && !payments.isEmpty()){
            return payments.iterator().next();
        }
        return null;
    }
    
    public void setPayments(List<OrderPaymentViewBean> payments) {
        this.payments = payments;
    }
    
    public List<OrderStateViewBean> getStates() {
        return states;
    }
    
    public void setStates(List<OrderStateViewBean> states) {
        this.states = states;
    }
    
    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }
    
}