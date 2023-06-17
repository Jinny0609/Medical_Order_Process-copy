function redirectToProduct(product_id, category_id) {
    var url = '/Product_details?productId=' + product_id + '&categoryId=' + category_id;
    window.location.href = url;
}