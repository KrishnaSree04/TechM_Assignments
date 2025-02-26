var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Car1 = /** @class */ (function () {
    function Car1(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    return Car1;
}());
var SUV = /** @class */ (function (_super) {
    __extends(SUV, _super);
    function SUV(make, model, year, offRoadCapable) {
        var _this = _super.call(this, make, model, year) || this;
        _this.offRoadCapable = offRoadCapable;
        return _this;
    }
    SUV.prototype.toggleOffRoad = function () {
        this.offRoadCapable = !this.offRoadCapable;
        console.log("Off-road mode is now ".concat(this.offRoadCapable ? "enabled" : "disabled", "."));
    };
    return SUV;
}(Car1));
// Example usage
var suv = new SUV("Jeep", "Wrangler", 2024, true);
suv.toggleOffRoad();
suv.toggleOffRoad();
