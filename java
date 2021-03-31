javascript: (function() {
    var wa = document.getElementsByClassName('site-header__branding');
    wa[0].parentNode.parentNode.removeChild(wa[0].parentNode);

    var bnrs = document.getElementsByClassName('basic-banner js-component');
        while(bnrs.length > 0){
            bnrs[0].parentNode.removeChild(bnrs[0]);
    }

    var bnrs2 = document.getElementsByClassName('app-campaign js-component');
        while(bnrs2.length > 0){
            bnrs2[0].parentNode.removeChild(bnrs2[0]);
    }

    var popups = document.getElementsByClassName('login-offering js-login-offering');
        while(popups.length > 0){
            popups[0].parentNode.removeChild(popups[0]);
    }
})()
