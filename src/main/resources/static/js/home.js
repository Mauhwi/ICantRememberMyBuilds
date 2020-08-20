var _timer = 0;

function DelayTooltip() {
    if (_timer)
    window.clearTimeout(_timer);
    _timer = window.setTimeout(function() {
        keyPress();
    }, 2000);
}

function keyPress() {
    document.getElementById('hpTooltip').style.opacity = '0';
    document.getElementById('mpTooltip').style.opacity = '0';
    document.getElementById('spTooltip').style.opacity = '0';
}

function checkhp() {
    var hpv = document.getElementById('hp').value;
    var mpv = document.getElementById('mp').value;
    var spv = document.getElementById('sp').value;
    if (hpv > 64) {
        document.getElementById('hpTooltip').style.opacity = '1';
        document.getElementById('hpTooltip').setAttribute('data-tooltip', "Can't be more than 64");
    } else if (mpv > 64 || spv > 64 || ((mpv + spv) > 64) || ((hpv + mpv) > 64) || ((hpv + spv) > 64)) {
        document.getElementById('hpTooltip').style.opacity = '1';
        document.getElementById('hpTooltip').setAttribute('data-tooltip', "Sum of all attributes can't be more than 64");
    }
}

function checkmp() {
    var hpv = document.getElementById('hp').value;
    var mpv = document.getElementById('mp').value;
    var spv = document.getElementById('sp').value;
    if (mpv > 64) {
        document.getElementById('mpTooltip').style.opacity = '1';
        document.getElementById('mpTooltip').setAttribute('data-tooltip', "Can't be more than 64");
    } else if (hpv > 64 || spv > 64 || ((hpv + spv) > 64) || ((hpv + mpv) > 64) || ((mpv + spv) > 64)) {
        document.getElementById('mpTooltip').style.opacity = '1';
        document.getElementById('mpTooltip').setAttribute('data-tooltip', "Sum of all attributes can't be more than 64");
    }
}

function checksp() {
    var hpv = document.getElementById('hp').value;
    var mpv = document.getElementById('mp').value;
    var spv = document.getElementById('sp').value;
    if (spv > 64) {
        document.getElementById('spTooltip').style.opacity = '1';
        document.getElementById('spTooltip').setAttribute('data-tooltip', "Can't be more than 64");
    } else if (hpv > 64 || mpv > 64 || ((hpv + spv) > 64)) {
        document.getElementById('spTooltip').style.opacity = '1';
        document.getElementById('spTooltip').setAttribute('data-tooltip', "Sum of all attributes can't be more than 64");
    }
}