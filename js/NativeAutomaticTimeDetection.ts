import type { TurboModule } from 'react-native/Libraries/TurboModule/RCTExport';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
    isAutomaticTimeZoneEnabled(): Promise<boolean>;
    isAutomaticTimeEnabled(): Promise<boolean>;
}

export default TurboModuleRegistry.get<Spec>(
    'RNAutomaticTimeDetection',
) as Spec | null;